package org.earthsystemmodeling.cupid.nuopc

import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.lexer.Token
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.IExpr

class ASTQuery {
	
	def static findArgNodeByKeyword(ASTCallStmtNode node, String keyword) {
		node.argList.findArgNodeByKeyword(keyword)
	}
	
	def static findArgNodeByKeyword(IASTListNode<ASTSubroutineArgNode> nodes, String keyword) {
		nodes.findFirst[
			it.name?.text?.eic(keyword)
		]
	}
	
	def static litArgExprByKeyword(ASTCallStmtNode node, String keyword) {
		node.findArgNodeByKeyword(keyword)?.expr?.literal
	}
	
	def static litArgExprByKeyword(IASTListNode<ASTSubroutineArgNode> nodes, String keyword) {
		nodes.findArgNodeByKeyword(keyword)?.expr?.literal
	}
	
	def static litArgExprByIdx(ASTCallStmtNode node, int idx) {
		node.argList?.get(idx)?.expr?.literal
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
		a.equalsIgnoreCase(b)
	}
	
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
	}
	
}