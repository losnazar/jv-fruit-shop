package core.basesyntax.dao;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import java.util.List;

public class FruitTransactionDaoImpl implements FruitTransactionDao {

    @Override
    public void add(FruitTransaction fruitTransaction) {
        Storage.fruitTransactions.add(fruitTransaction);
    }

    @Override
    public List<FruitTransaction> getAll() {
        return Storage.fruitTransactions;
    }
}
