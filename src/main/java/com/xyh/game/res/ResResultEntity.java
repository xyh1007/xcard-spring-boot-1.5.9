package com.xyh.game.res;

import java.io.Serializable;

public class ResResultEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7864957568015378909L;
	private int resultCode = -1;
    private String message;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
