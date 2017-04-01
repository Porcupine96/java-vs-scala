package D;

class DJava {

    /*
    May not be the best example - in real life we would probably have different toString() implementations
    for both ColorRGB and ColorWithUrl and just call color.toString(). :)
     */

    String colorAsString(Color color) {
        if (color instanceof ColorRGB) {
            ColorRGB colorRGB = (ColorRGB) color;
            return colorRGB.r + " " + colorRGB.g + " " + colorRGB.b;
        } else if (color instanceof ColorWithUrl) {
            ColorWithUrl colorWithUrl = (ColorWithUrl) color;
            return colorWithUrl.colorName;
        } else {
            throw new IllegalArgumentException("unhandled color type");
        }
    }


    interface Color {

    }

    static class ColorRGB implements Color {
        final int r;
        final int g;
        final int b;

        ColorRGB(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }

    static class ColorWithUrl implements Color {
        final String colorName;
        final String urlToSample;

        ColorWithUrl(String colorName, String urlToSample) {
            this.colorName = colorName;
            this.urlToSample = urlToSample;
        }
    }

}


