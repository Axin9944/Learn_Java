package com.powernode.foudation003_list;

import java.util.Scanner;

public class RoomAndHotelTest {
    public static void main(String[] args) {
        /*Room room1 = new Room(101,"单人间",false);
        System.out.println(room1);*/
        /*Room[] rooms = new Room[] {room1,new Room(102,"单人间",false)};
        for (Room r : rooms){
            System.out.print(r);
        }*/
        /*Room[][] roomss = new Room[][] {
                {room1,new Room(102,"单人间",false)},
                {new Room(201,"单人间",false),new Room(202,"单人间",false)}
        };
        for (int i = 0; i < roomss.length; i++) {
            for (Room r : roomss[i]){
                System.out.print(r);
            }
            System.out.println();
        }*/
        /*int room = 902;
        System.out.println(room % 100);*/

        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel();
        hotel.createRoom();

        int falg = 1;
        System.out.println("欢迎来到酒店管理系统");
        while (falg != 4){
            hotel.print2();
            hotel.print3();
            hotel.print4();
            hotel.print5();
            hotel.print6();
            System.out.print("请输入编号：");
            int number = input.nextInt();
            switch (number){
                case 1 :{ hotel.display();
                            break;
                }
                case 2 :{
                    System.out.print("请输入房间编号：");
                    number = input.nextInt();
                    hotel.orderRoom(number);
                    break;
                }
                case 3 : {
                    System.out.print("请输入房间编号：");
                    number = input.nextInt();
                    hotel.exitRoom(number);
                    break;
                }
                case 4 : {
                    falg = 4;
                    System.out.println("欢迎使用，再见！！");
                    break;
                }
            }
        }

    }
}
