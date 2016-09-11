package com.hasith.controllers;

import com.hasith.model.PageRequest;
import com.hasith.model.Pagination;
import com.hasith.model.User;

import java.util.ArrayList;
import java.util.List;

public class PaginationController {
    public Pagination getPage(PageRequest request){
        User user1 = new User(1,"user first 1", "user last 1");
        User user2 = new User(2,"user first 2", "user last 2");
        User user3 = new User(3,"user first 3", "user last 3");
        User user4 = new User(4,"user first 4", "user last 4");
        User user5 = new User(5,"user first 5", "user last 5");
        User user6 = new User(6,"user first 6", "user last 6");
        User user7 = new User(7,"user first 7", "user last 7");
        User user8 = new User(8,"user first 8", "user last 8");
        User user9 = new User(9,"user first 9", "user last 9");
        User user10 = new User(10,"user first 10", "user last 10");

        User user11 = new User(11,"user first 11", "user last 11");
        User user12 = new User(12,"user first 12", "user last 12");
        User user13 = new User(13,"user first 13", "user last 13");
        User user14 = new User(14,"user first 14", "user last 14");
        User user15 = new User(15,"user first 15", "user last 15");
        User user16 = new User(16,"user first 16", "user last 16");
        User user17 = new User(17,"user first 17", "user last 17");
        User user18 = new User(18,"user first 18", "user last 18");
        User user19 = new User(19,"user first 19", "user last 19");
        User user20 = new User(20,"user first 20", "user last 20");

        User user21 = new User(21,"user first 21", "user last 21");
        User user22 = new User(22,"user first 22", "user last 22");
        User user23 = new User(23,"user first 23", "user last 23");
        User user24 = new User(24,"user first 24", "user last 24");
        User user25 = new User(25,"user first 25", "user last 25");
        User user26 = new User(26,"user first 26", "user last 26");
        User user27 = new User(27,"user first 27", "user last 27");
        User user28 = new User(28,"user first 28", "user last 28");
        User user29 = new User(29,"user first 29", "user last 29");
        User user30 = new User(30,"user first 30", "user last 30");

        User user31 = new User(31,"user first 31", "user last 31");
        User user32 = new User(32,"user first 32", "user last 32");
        User user33 = new User(33,"user first 33", "user last 33");
        User user34 = new User(34,"user first 34", "user last 34");
        User user35 = new User(35,"user first 35", "user last 35");
        User user36 = new User(36,"user first 36", "user last 36");
        User user37 = new User(37,"user first 37", "user last 37");
        User user38 = new User(38,"user first 38", "user last 38");

        List<User> users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        List<User> users1 = new ArrayList();
        users1.add(user11);
        users1.add(user12);
        users1.add(user13);
        users1.add(user14);
        users1.add(user15);
        users1.add(user16);
        users1.add(user17);
        users1.add(user18);
        users1.add(user19);
        users1.add(user20);

        List<User> users2 = new ArrayList();
        users2.add(user21);
        users2.add(user22);
        users2.add(user23);
        users2.add(user24);
        users2.add(user25);
        users2.add(user26);
        users2.add(user27);
        users2.add(user28);
        users2.add(user29);
        users2.add(user30);

        List<User> users3 = new ArrayList();
        users3.add(user31);
        users3.add(user32);
        users3.add(user33);
        users3.add(user34);
        users3.add(user35);
        users3.add(user36);
        users3.add(user37);
        users3.add(user38);

        if(request.getStart()==0){
            return new Pagination(users, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==10){
            return new Pagination(users1, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==20){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==30){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==40){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==50){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==60){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==70){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==80){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==90){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==100){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==110){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==120){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==130){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==140){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==150){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==160){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==170){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==180){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==190){
            return new Pagination(users2, Integer.toString(request.getDraw()),208, 208);
        }
        if(request.getStart()==200){
            return new Pagination(users3, Integer.toString(request.getDraw()),208, 208);
        }
        
        
        return new Pagination(users, Integer.toString(request.getDraw()),208, 208);
    }
}
