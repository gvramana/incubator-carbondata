package acidic.src.main.java;

import org.apache.carbondata.acidic.operation.Operation;
import org.apache.carbondata.acidic.transaction.ACIDTxnManager;
import org.apache.carbondata.acidic.transaction.Txn;
import org.apache.carbondata.acidic.transaction.TxnManager;

/**
 * Created by root1 on 2/6/17.
 */
public class AcidicExample {
  public static void main(String[] args) {
    TxnManager txnManager = new ACIDTxnManager();
    txnManager.beginTransaction();
    txnManager.executeOperation(new DummyOperation());
    txnManager.executeOperation(new DummyOperation());
    txnManager.endTransaction();
  }
}


class DummyOperation implements Operation {

  public void init(Txn txnId) {

  }

  public void exec(Txn txnId) {

  }

  public void commit(Txn txnId) {

  }

  public void abort(Txn txnId) {

  }

  public void cleanUp(Txn txnId) {

  }
}
