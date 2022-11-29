package advisor.view.impl;

import advisor.view.Format;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Scanner;

import static advisor.Config.ITEM_PER_PAGE;

public class FormatNew implements Format {

    @Override
    public void out(final JsonArray arr, final int Counter) {

        System.out.println(((JsonObject) arr.get(Counter)).get("name").getAsString());

        JsonArray artists = ((JsonObject) arr.get(Counter)).get("artists").getAsJsonArray();
        System.out.print("[");
        for (int k = 0; k < artists.size(); k++) {
            System.out.print(((JsonObject) artists.get(k)).get("name").getAsString());
            if (k + 1 != artists.size()) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println(((JsonObject) arr.get(Counter)).get("external_urls")
                .getAsJsonObject().get("spotify").getAsString());
        System.out.println();

    }
}
