package org.apache.carbondata.acidic.operation;

import org.apache.carbondata.acidic.transaction.Txn;

/**
 * Operation to be executed in a transaction
 */
public interface Operation {
  public void init(Txn txnId);
  public void exec(Txn txnId);
  public void commit(Txn txnId);
  public void abort(Txn txnId);
  public void cleanUp(Txn txnId);
}
