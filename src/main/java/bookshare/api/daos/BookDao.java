package bookshare.api.daos;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;

public class BookDao extends AbstractBookShareDao {

    @Autowired
    public BookDao(MongoClient mongoClient, String databaseName) {
        super(mongoClient, databaseName);
    }
}
