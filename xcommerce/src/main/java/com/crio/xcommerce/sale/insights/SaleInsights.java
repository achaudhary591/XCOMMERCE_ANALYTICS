
package com.crio.xcommerce.sale.insights;

import com.crio.xcommerce.contract.exceptions.AnalyticsException;
import com.crio.xcommerce.contract.insights.SaleAggregate;
import com.crio.xcommerce.contract.resolver.DataProvider;
import java.io.IOException;

public interface SaleInsights {

  SaleAggregate getSaleInsights(DataProvider dataProvider, int year)
      throws IOException, AnalyticsException;

}
