package dev.twostepsahead;

import net.fabricmc.api.ClientModInitializer;

public class TwoStepsAheadClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        TwoStepsAhead.LOGGER.info("On initialize cliebt");
    }
}
