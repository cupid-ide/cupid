package org.earthsystemmodeling.cupid.nuopc

import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.lexer.Token
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.IExpr
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode

class ASTQuery {
	
	def static findArgNodeByKeyword(ASTCallStmtNode node, String keyword) {
		node.argList.findArgNodeByKeyword(keyword)
	}
	
	def static findArgNodeByKeyword(IASTListNode<ASTSubroutineArgNode> nodes, String keyword) {
		nodes.findFirst[
			it.name?.text?.eic(keyword)
		]
	}
	
	def static <E extends IExpr> E argExprByKeyword(ASTCallStmtNode node, String keyword) {
		node.findArgNodeByKeyword(keyword)?.expr as E
	}
	
	def static <E extends IExpr> E argExprByIdx(ASTCallStmtNode node, int idx) {
		node.argList?.get(idx)?.expr as E
	}
	
	def static <E extends IExpr> E argExprByKeywordElseIdx(ASTCallStmtNode node, String keyword, int idx) {
		val ret = argExprByKeyword(node, keyword)
		if (ret != null) ret as E
		else argExprByIdx(node, idx)
	}
	
	def static litArgExprByKeyword(ASTCallStmtNode node, String keyword) {
		node.findArgNodeByKeyword(keyword)?.expr?.literal
	}
	
	def static litArgExprByKeyword(IASTListNode<ASTSubroutineArgNode> nodes, String keyword) {
		nodes.findArgNodeByKeyword(keyword)?.expr?.literal
	}
	
	def static litArgExprByIdx(ASTCallStmtNode node, int idx) {
		argExprByIdx(node, idx)?.literal
	}
	
	def static litArgExprByKeywordElseIdx(ASTCallStmtNode node, String keyword, int idx) {
		val ret = litArgExprByKeyword(node, keyword)
		if (ret != null) ret
		else litArgExprByIdx(node, idx)
	}
	
	def static localName(ASTModuleNode moduleNode, String usedModule, String usedEntity) {
		var node = moduleNode.body.filter(ASTUseStmtNode).findFirst[
			it.name.eic(usedModule)
		]
		if (node != null) {
			node.renameList?.findFirst[it.name.eic(usedEntity)]?.newName?.text ?:
			node.onlyList?.findFirst[it.name.eic(usedEntity)]?.newName?.text ?:
			usedEntity
		}
	}
	
	
	def static eic(String a, String b) {
		a?.equalsIgnoreCase(b)
	}
	
	
	/*
	def static eic(Token t, Object o) {
		if (o instanceof String) {
			eic(t, o as String)
		}
		else if (o instanceof Token) {
			eic(t, o as Token)
		}
		else {
			eic(t, o.toString)
		}
	}
	*/
	
	def static eic(Token t, String s) {
		s.eic(t.text)
	}
	
	def static eic(String s, Token t) {
		s.eic(t.text)
	}
	
	def static eic(Token a, Token b) {
		a.text.eic(b.text)
	}
	
	def static literal(IExpr expr) {
		expr.toString.trim
		//switch expr {
		//	ASTVarOrFnRefNode : expr.name.name.text
		//	default : expr.toString.trim
		//}
	}
	
}