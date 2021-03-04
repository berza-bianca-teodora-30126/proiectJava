package Visitor;

public interface ShoppingVisitor {
    int visit(Scheduler scheduler);
    int visit(Vegetables vegetables);
}
