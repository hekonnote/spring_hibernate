package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {

   void add(User user);

   List<User> listUsers();

   //в сервис добавьте метод, который с помощью hql-запроса будет доставать юзера,
   //по модели и серии машины.
   List<User> getUserByModelAndSeries(String model, int series);

}
