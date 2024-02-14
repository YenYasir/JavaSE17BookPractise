package chapterexercise.ch7;

public class CashCardService {
    private CashCardDAO dao;

    public CashCardService(CashCardDAO dao) {
        this.dao = dao;
    }

    public  void save(CashCard cashCard) {
        dao.save(cashCard);
    }

    public CashCard load(String number) {
        return dao.load(number);
    }
}
