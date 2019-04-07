package creationalpatterns.Builder;

public class Coffee {
        private String type;
        private boolean sugar;
        private boolean milk;
        private String size;

        //Returned by CoffeeBuilder build method
        private Coffee(CoffeeBuilder builder) {
            this.type   =   builder.type;
            this.sugar  =   builder.sugar;
            this.milk   =   builder.milk;
            this.size   =   builder.size;
            System.out.println("Coffee Constructor Called: ");
        }

        public static class CoffeeBuilder {
            private String type;
            private boolean sugar;
            private boolean milk;
            private String size;
            public CoffeeBuilder(String value) {
                type = value;
            }

            public CoffeeBuilder sugar(boolean value) {
                sugar = value;
                return this;
            }
            public CoffeeBuilder milk(boolean value) {
                milk = value;
                return this;
            }
            public Coffee build() {
                return new Coffee(this);
            }
            public CoffeeBuilder size(String value) {
                size = value;
                return this;
            }
        }

        @Override
        public String toString() {
            return String.format("Coffee [type=%s, sugar=%s, milk=%s, size=%s]",
                            type, sugar, milk, size);
        }

}
