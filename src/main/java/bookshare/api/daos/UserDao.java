package bookshare.api.daos;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDao extends AbstractBookShareDao {

    @Autowired
    public UserDao(MongoClient mongoClient, String databaseName) {
        super(mongoClient, databaseName);
    }
}
