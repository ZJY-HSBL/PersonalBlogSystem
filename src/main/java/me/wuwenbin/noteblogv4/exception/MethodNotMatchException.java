package me.wuwenbin.noteblogv4.exception;

/**
 *   2019/8/3 at 22:16
 * @author wuwenbin
 */
public class MethodNotMatchException extends RuntimeException {
    public MethodNotMatchException() {
        super();
    }

    public MethodNotMatchException(String message) {
        super(message);
    }

    public MethodNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public MethodNotMatchException(Throwable cause) {
        super(cause);
    }
}
