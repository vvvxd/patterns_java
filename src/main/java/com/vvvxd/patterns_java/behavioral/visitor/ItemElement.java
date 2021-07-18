package com.vvvxd.patterns_java.behavioral.visitor;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
