package com.powernode.foudation003_list;

public class Room {
    // 房间编号
    private int roomNo;

    // 房间类型
    private String type;

    // 房间状态
    private boolean state;

    public Room() {
    }

    public Room(int roomNo, String type, boolean state) {
        this.roomNo = roomNo;
        this.type = type;
        this.state = state;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "[" +
                 roomNo  + ", " + type + ", " + (state ? "占用" : "空闲") +
                ']';
    }
}
