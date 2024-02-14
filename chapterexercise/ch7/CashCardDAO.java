package chapterexercise.ch7;


//DAO (data access object)：
//
//        用於ORM將資料從資料庫提取的邏輯物件，其中邏輯主要包含如何提取資料庫的資料並且將資料包裝成PO。
//        用來封裝對資料庫的訪問，通過它可以把 POJO 持久化為 PO，用PO去組裝成 DTO、VO。
//        是一個物件導向的 interface，負責持久層的操作，主要用來封裝對數據庫的訪問，常見操作不外乎 CRUD。
//        DAO管理著所有的資料訪問細節，所有的實現細節相關的程式碼（比如SQL 語句)都包含在DAO而不在商業物件中. 大大提高了開發效率.
public interface CashCardDAO {
    void save(CashCard cashCard);
    CashCard load(String number);
}
