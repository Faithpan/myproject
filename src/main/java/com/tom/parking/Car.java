package com.tom.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
//    把long值改成LocalDateTime
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }
    public long getDuration(){
        Duration duration = Duration.between(enter,leave);
        return duration.toMinutes();
    }
//離開停車場的時間記錄
    public void leave(){
        leave = LocalDateTime.now();
    }
//    設定long值到leave，避免直接給值會造成錯誤 當判別用
//    因為值已經先設成private ，所以設計一個public對外公開的方法把值傳入並檢查
//此為物件導向的方法
    public void setLeave(LocalDateTime leave){
//        判別出場時間大於進場時間
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }
}
