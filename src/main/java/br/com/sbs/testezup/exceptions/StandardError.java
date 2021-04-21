package br.com.sbs.testezup.exceptions;

import java.io.Serializable;

/**
 *  Essa classe representa o padrão de msg que serão retornadas ao usuario, quando sistemas lançar um exception.
 */
public class StandardError implements Serializable {
    private  static final long serialVersionUID = 1L;

    private Integer status;
    private String msg;
    private Long timeStamp;

    public StandardError(Integer status, String msg, Long timeStamp) {
        this.status = status;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }


}
