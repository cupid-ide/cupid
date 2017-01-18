package org.earthsystemmodeling.cupid.cc.mapping;

import java.util.List;
import java.util.function.Predicate;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingResultSet {
  @Accessors
  private MappingType type;
  
  private List<MappingResult> results = CollectionLiterals.<MappingResult>newLinkedList();
  
  public MappingResultSet(final MappingType type) {
    this.type = type;
  }
  
  public List<MappingResult> getResults() {
    return this.results;
  }
  
  public MappingResult get(final int index) {
    return this.results.get(index);
  }
  
  public MappingResult first() {
    return this.get(0);
  }
  
  /**
   * def pop() {
   * if (results.size() > 0) {
   * return results.remove(0)
   * }
   * else {
   * return null
   * }
   * }
   */
  public MappingResult addMatch(final Object match) {
    MappingResult _xblockexpression = null;
    {
      final MappingResult r = new MappingResult(match);
      this.results.add(r);
      _xblockexpression = r;
    }
    return _xblockexpression;
  }
  
  public int size() {
    return this.results.size();
  }
  
  public <T extends Object> MappingResultSet removeMatchIf(final Function1<? super T, Boolean> predicate) {
    MappingResultSet _xblockexpression = null;
    {
      final Predicate<MappingResult> _function = (MappingResult r) -> {
        Object _match = r.match();
        return (predicate.apply(((T) _match))).booleanValue();
      };
      this.results.removeIf(_function);
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  public <T extends Object> MappingResultSet retainMatchIf(final Function1<? super T, Boolean> predicate) {
    MappingResultSet _xblockexpression = null;
    {
      final Predicate<MappingResult> _function = (MappingResult r) -> {
        Object _match = r.match();
        Boolean _apply = predicate.apply(((T) _match));
        return (!(_apply).booleanValue());
      };
      this.results.removeIf(_function);
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  @Pure
  public MappingType getType() {
    return this.type;
  }
  
  public void setType(final MappingType type) {
    this.type = type;
  }
}
