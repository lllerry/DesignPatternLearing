package builder.noodle_demo;

public class Noodle {
    private String chili;
    private String salt;
    private String peanut;

    public Noodle(Builder builder) {
        chili = builder.chili;
        salt = builder.salt;
        peanut = builder.peanut;
    }

    //    建造者
    public static class Builder {
        //        副本
        private String chili;
        private String salt;
        private String peanut;

        public Builder addChili(String chili) {
            this.chili = chili;
            return this;
        }

        public Builder addSalt(String salt) {
            this.salt = salt;
            return this;
        }

        public Builder addPeanut(String peanut) {
            this.peanut = peanut;
            return this;
        }

        public Noodle build() {
            return new Noodle(this);
        }

    }
}
