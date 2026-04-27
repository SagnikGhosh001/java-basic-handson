// Money.java

class Money {
  final int value;

  Money(int value) {
    this.value = value;
  }

  Money add(Money adderMoney) {
    return new Money(this.value + adderMoney.value);
  }

  Money minus(Money adderMoney) {
    return new Money(this.value - adderMoney.value);
  }
}