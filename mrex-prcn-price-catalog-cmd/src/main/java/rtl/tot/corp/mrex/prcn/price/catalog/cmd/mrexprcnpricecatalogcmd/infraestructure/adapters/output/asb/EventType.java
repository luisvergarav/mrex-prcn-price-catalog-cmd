package rtl.tot.corp.mrex.prcn.price.catalog.cmd.mrexprcnpricecatalogcmd.infraestructure.adapters.output.asb;

public enum EventType {
    PRICE_CREATED("priceCreated"),
    PRICE_UPDATED("priceUpdated"),
    PRICE_DELETED("priceDeleted");
    private final String name;

    EventType(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

