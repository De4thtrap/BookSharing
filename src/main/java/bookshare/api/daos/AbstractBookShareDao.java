package bookshare.api.daos;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
//
//@PropertySource("classpath:application.properties")
public abstract class AbstractBookShareDao {

    protected final String BOOKSHARE_DATABASE;
    protected MongoDatabase db;
    protected MongoClient mongoClient;

    protected AbstractBookShareDao(MongoClient mongoClient, String databaseName) {
        this.mongoClient = mongoClient;
        BOOKSHARE_DATABASE = databaseName;
        this.db = this.mongoClient.getDatabase(BOOKSHARE_DATABASE);
    }
}
