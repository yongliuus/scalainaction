import scala.beans.BeanProperty
import javax.persistence._
import scala.annotation.meta.beanGetter

class A {   @(Id @beanGetter) @BeanProperty val x = 0 }
