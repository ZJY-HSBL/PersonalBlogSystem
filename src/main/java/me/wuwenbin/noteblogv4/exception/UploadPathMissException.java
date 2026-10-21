package me.wuwenbin.noteblogv4.exception;

/**
 *   2019/8/3 at 23:10
 * @author wuwenbin
 */
public class UploadPathMissException extends RuntimeException {
    public UploadPathMissException() {
        super();
    }

    public UploadPathMissException(String message) {
        super(message);
    }

    public UploadPathMissException(String message, Throwable cause) {
        super(message, cause);
    }

    public UploadPathMissException(Throwable cause) {
        super(cause);
    }
}
