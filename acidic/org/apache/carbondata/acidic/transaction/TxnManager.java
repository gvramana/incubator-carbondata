package org.apache.carbondata.acidic.transaction;

import org.apache.carbondata.acidic.operation.Operation;

/**
 * Created by root1 on 2/6/17.
 */
public interface TxnManager {
  public Txn beginTransaction();
  public void executeOperation(Operation operation);
  public Txn endTransaction();
  public Txn abortTransaction();
  public Txn getTxn();
}
