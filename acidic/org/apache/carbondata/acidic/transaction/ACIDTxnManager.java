package org.apache.carbondata.acidic.transaction;

import org.apache.carbondata.acidic.operation.Operation;

/**
 * Created by root1 on 2/6/17.
 */
public class ACIDTxnManager implements TxnManager {

  static final InheritableThreadLocal<Txn> threadLocal = new InheritableThreadLocal<Txn>();

  public Txn beginTransaction() {
    return null;
  }

  public void executeOperation(Operation operation) {

  }

  public Txn endTransaction() {
    return null;
  }

  public Txn abortTransaction() {
    return null;
  }

  public Txn getTxn() {
    return threadLocal.get();
  }

  public static Txn getActiveTxn(){
    return threadLocal.get();
   }
}
