import org.teavm.jso.dom.html.*;

public class EmulatorDisplay {
    private static HTMLCanvasElement canvas;
    private static CanvasRenderingContext2D ctx;

    static {
        canvas = (HTMLCanvasElement) HTMLDocument.current().getElementById("canvas");
        ctx = (CanvasRenderingContext2D) canvas.getContext("2d");
    }

    public static void drawText(String text, int x, int y) {
        ctx.setFillStyle("black");
        ctx.fillText(text, x, y);
    }
}