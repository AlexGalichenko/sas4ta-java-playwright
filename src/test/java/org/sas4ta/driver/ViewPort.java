package org.sas4ta.driver;

public class ViewPort {
    public int height;
    public int width;
    public ViewPort() {
        String viewport = System.getenv().get("VIEWPORT") != null ? System.getenv().get("VIEWPORT") : "FHD";
        switch (viewport) {
            case "HD" -> {
                height = 720;
                width = 1280;
            }
            case "FHD" -> {
                height = 1080;
                width = 1920;
            }
            case "QHD" -> {
                height = 1440;
                width = 2560;
            }
            default -> throw new IllegalStateException("Unexpected value: " + viewport);
        }
    }
}
