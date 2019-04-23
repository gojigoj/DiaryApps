package motion.diaryapps.list_notes;

import java.io.Serializable;

/**
 * Class ini digunakan untuk sebagai Model data pada layout item
 */
public class ListNotesModel {

    private String id;
    private String image_url;
    // TODO: 4/12/19 -> Buat Attribute title dan date disini
    private String date;
    private String title;
    // hint: untuk date gunakan tipe data string, lakukan seperti contoh diatas

    // TODO: 4/12/19 -> Buat Constructor disini

    public ListNotesModel(String id, String image_url, String date, String title) {
        this.id = id;
        this.image_url = image_url;
        this.date = date;
        this.title = title;
    }

    // hint: Gunakan alt+insert


    // TODO: 4/12/19 -> Buat Getter dan Setternya disini

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // hint: Gunakan alt+insert

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }


}
