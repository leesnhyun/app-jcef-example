package example.detailed.handler;

import org.cef.browser.CefBrowser;
import org.cef.callback.CefDragData;
import org.cef.handler.CefRenderHandler;

import java.awt.*;
import java.nio.ByteBuffer;

/**
 * Created by SH on 2018-04-14.
 */
public class RenderHandler implements CefRenderHandler {
    @Override
    public Rectangle getViewRect(CefBrowser browser) {
        return getViewRect(browser);
    }

    @Override
    public Point getScreenPoint(CefBrowser browser, Point viewPoint) {
        return null;
    }

    @Override
    public void onPopupShow(CefBrowser browser, boolean show) {

    }

    @Override
    public void onPopupSize(CefBrowser browser, Rectangle size) {

    }

    @Override
    public void onPaint(CefBrowser browser, boolean popup, Rectangle[] dirtyRects, ByteBuffer buffer, int width, int height) {

    }

    @Override
    public void onCursorChange(CefBrowser browser, int cursor) {

    }

    @Override
    public boolean startDragging(CefBrowser browser, CefDragData dragData, int mask, int x, int y) {
        return false;
    }

    @Override
    public void updateDragCursor(CefBrowser browser, int operation) {

    }
}
