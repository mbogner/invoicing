package dev.mbo.invoicing.model.shared;

import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEntity<ID> implements Serializable {

  public abstract ID getId();

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (!(o instanceof AbstractEntity)) return false;
    final AbstractEntity<?> that = (AbstractEntity<?>) o;
    return new EqualsBuilder()
      .append(getId(), that.getId())
      .isEquals();
  }

  @Override
  public int hashCode() {
    return this.getClass().getName().hashCode();
  }
}
