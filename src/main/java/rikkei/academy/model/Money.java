package rikkei.academy.model;

public class Money {
    private Double vnd;
    private Double usd;
    private Double rate;
    private Double result;

    public Money() {
    }

    public Money(Double vnd, Double usd, Double rate, Double result) {
        this.vnd = vnd;
        this.usd = usd;
        this.rate = rate;
        this.result = result;
    }

    public Double getVnd() {
        return vnd;
    }

    public void setVnd(Double vnd) {
        this.vnd = vnd;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
