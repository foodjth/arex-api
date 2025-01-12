package com.arextest.web.model.contract.contracts.config;

import java.util.Set;
import lombok.Data;

/**
 * @author wildeslam.
 * @create 2023/9/25 16:57
 */
@Data
public class SystemConfig {

  private String operator;

  /**
   * for callBackInform.
   */
  private String callbackUrl;
  /**
   * control the compare precision of the time field.
   */
  private Long compareIgnoreTimePrecisionMillis;
  /**
   * ignore the case, when comparing
   */
  private Boolean compareNameToLower;
  /**
   * the null and '' think unanimously, when comparing
   */
  private Boolean compareNullEqualsEmpty;

  /**
   * according to the names of node to ignore the node.
   */
  private Set<String> ignoreNodeSet;

  /**
   * skip the compare of select, when comparing database.
   */
  private Boolean selectIgnoreCompare;

  /**
   * only compare the coincident columns, when comparing database.
   */
  private Boolean onlyCompareCoincidentColumn;

  /**
   * ignore the compare of uuid
   */
  private Boolean uuidIgnore;

  /**
   * ignore the compare of uuid
   */
  private Boolean ipIgnore;
}
