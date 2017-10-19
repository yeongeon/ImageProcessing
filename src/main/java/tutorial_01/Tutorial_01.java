package tutorial_01;

import common.CommonImage;

public class Tutorial_01 {

    static class Image extends CommonImage {
        // ----------------
    }


    public static void main(String[] args){
        Image image = new Image();

        String path = Tutorial_01.class.getResource("/tutorial_01/sample.ppm").getPath();

        image.load(path);

    }
}
