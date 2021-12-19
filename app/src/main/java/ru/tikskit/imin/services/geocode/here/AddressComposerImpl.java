package ru.tikskit.imin.services.geocode.here;

import java.util.ArrayList;
import java.util.List;

class AddressComposerImpl implements AddressComposer {
    private final static String DELIMITER = "+";

    private final List<String> parts = new ArrayList<>();

    @Override
    public AddressComposer addPart(String part) {
        if (part != null && !part.isBlank()) {
            parts.add(part);
        }
        return this;
    }

    @Override
    public String build() {
        return String.join(DELIMITER, parts);
    }
}