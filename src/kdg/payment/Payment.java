package kdg.payment;

import java.time.LocalDateTime;

public class Payment {
    private LocalDateTime time;
    private String detail;
    private Money bedrag;

    public Payment(LocalDateTime time, String detail, Money bedrag) {
        this.time = time;
        this.detail = detail;
        this.bedrag = bedrag;
    }

    //region getters en setters

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Money getBedrag() {
        return bedrag;
    }

    public void setBedrag(Money bedrag) {
        this.bedrag = bedrag;
    }

    //endregion

    private void berekenBedrag(){
    bedrag = null;
    }
}
