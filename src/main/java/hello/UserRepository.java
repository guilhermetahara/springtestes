package hello;

import org.springframework.data.repository.CrudRepository;

//Interface do repositorio de usuarios onde o spring opera
// CRUD = create, read, update, delete
public interface UserRepository extends CrudRepository<User, Long>{

}
