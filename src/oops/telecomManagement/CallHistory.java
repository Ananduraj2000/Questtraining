package oops.telecomManagement;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CallHistory implements Serializable {
    private int s_id;
    private String callType;
    private int duration;
    private LocalDateTime date;

    public CallHistory(int id, String callType, int duration, LocalDateTime date) {
        this.s_id = id;
        this.callType = callType;
        this.duration = duration;
        this.date = date;
    }

    public int getS_id() {
        return s_id;
    }

    public String getCallType() {
        return callType;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDateTime getDate() {
        return date;
    }


//    public String toString() {
//        return "CallHistory [id=" + s_id + ", callType=" + callType + ", duration="
//                +duration+", date="+date+"]";
//    }

    public String getDetails() {
        return String.format("Subscriber ID: %d, Call Type: %s, Duration: %d mins, Time: %s",
                s_id, callType, duration, date);
    }

}
