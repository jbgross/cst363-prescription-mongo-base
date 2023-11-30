package lab21.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
// force rebuild
@Document(collection = "database_sequences")
public class DatabaseSequence {

    @Id
    private String id;

    private int seq;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

    
}