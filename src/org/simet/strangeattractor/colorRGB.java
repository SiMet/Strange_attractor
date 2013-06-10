package org.simet.strangeattractor;

public class colorRGB {
    int R;
    int G;
    int B;

    colorRGB(int rgb) {
        B = rgb % 256;
        G = (rgb % (256 * 256)) / 256;
        R = (rgb % (256 * 256 * 256)) / (256 * 256);
    }

    colorRGB(int r, int g, int b) {
        R = r;
        G = g;
        B = b;
    }

    int getRGB() {
        return R * 256 * 256 + G * 256 + B;
    }

    colorRGB add(colorRGB c) {
        int r, g, b;
        r = c.R + R;
        if (r > 255)
            r = 255;
        g = c.G + G;
        if (g > 255)
            g = 255;
        b = c.B + B;
        if (b > 255)
            b = 255;
        return new colorRGB(r, g, b);
    }

    colorRGB mnoz(double a) {
        int r = (int) (R * a);
        if (R <= 0)
            r = 0;
        else if (r > 255)
            r = 255;
        int g = (int) (G * a);
        if (G <= 0)
            g = 0;
        else if (g > 255)
            g = 255;
        int b = (int) (B * a);
        if (B <= 0)
            b = 0;
        else if (b > 255)
            b = 255;
        return new colorRGB(r, g, b);
    }
}