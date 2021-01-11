package fullstack.engineer.business.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * sample_tableテーブルとマッピングするクラス<br>
 * @author maeda
 *
 */
@Entity
@Table(name="sample_table")
public class Sample implements Serializable {

    @Id
    private Long id;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sample{" + "id=" + id + ", value=" + value + '}';
    }
}
