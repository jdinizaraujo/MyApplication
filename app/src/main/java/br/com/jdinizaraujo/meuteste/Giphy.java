package br.com.jdinizaraujo.meuteste;

import java.util.Map;

/**
 * Created by juliana on 24/10/16.
 */

public class Giphy {

    public String id;
    public String type;
    public Map<String, GiphyImage> images;

    public class GiphyImage {
        public String url;
        public int width;
        public int height;
        public int size;
        public String webp;
        public int webp_size;

    }
}
