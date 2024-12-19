package com.powernode.foudation003_list;

public class Hotel {
    private Room[][] rooms;
    public void print2(){
        System.out.println("请输入不同的数字选择不同的功能");
    }

    public void print3(){
        System.out.println("[1]查看房间状态");
    }

    public void print4(){
        System.out.println("[2]预定房间");
    }

    public void print5(){
        System.out.println("[3]退房");
    }

    public void print6(){
        System.out.println("[4]退出系统");
    }

    public Hotel() {
    }

    // 创建所有房间
    public void createRoom(){
        rooms = new Room[9][9];
        String type1 = "单人间";
        String type2 = "标准间";
        String type3 = "豪华间";
        boolean flag = false;
        for (int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[i].length; j++){
                switch(i){
                    case 0, 1, 2 -> rooms[i][j] = new Room(((i+1) * 100) + j + 1, type1, flag);
                    case 3, 4, 5 -> rooms[i][j] = new Room(((i+1) * 100) + j + 1, type2, flag);
                    case 6, 7, 8 -> rooms[i][j] = new Room(((i+1) * 100) + j + 1, type3, flag);
                }
            }
        }
    }

    // 显示所有房间
    public void display(){
        for (int i = 0; i < rooms.length; i++){
            for (Room j : rooms[i]){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 预定房间
    public void orderRoom(int num){
        num -= 100;
        rooms[num / 100][num % 100 - 1].setState(true);
        System.out.println("预定[" + (num + 100) + "]成功");
    }

    // 退房
    public void exitRoom(int num){
        num -= 100;
        if (rooms[num / 100][num % 100 - 1].isState()){
            rooms[num / 100][num % 100 - 1].setState(false);
            System.out.println("[" + (num + 100) + "]退房成功");
        }else{
            System.out.println("该房间是空房");
        }
    }
}
