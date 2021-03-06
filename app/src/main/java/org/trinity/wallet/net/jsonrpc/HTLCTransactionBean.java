package org.trinity.wallet.net.jsonrpc;

public class HTLCTransactionBean extends BaseJSONRpcBean {
    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private HCTXBean HCTX;
        private HEDTXBean HEDTX;
        private HERDTXBean HERDTX;
        private HETXBean HETX;
        private HTDTXBean HTDTX;
        private HTRDTXBean HTRDTX;
        private HTTXBean HTTX;
        private RDTXBean RDTX;

        public HCTXBean getHCTX() {
            return HCTX;
        }

        public void setHCTX(HCTXBean HCTX) {
            this.HCTX = HCTX;
        }

        public HEDTXBean getHEDTX() {
            return HEDTX;
        }

        public void setHEDTX(HEDTXBean HEDTX) {
            this.HEDTX = HEDTX;
        }

        public HERDTXBean getHERDTX() {
            return HERDTX;
        }

        public void setHERDTX(HERDTXBean HERDTX) {
            this.HERDTX = HERDTX;
        }

        public HETXBean getHETX() {
            return HETX;
        }

        public void setHETX(HETXBean HETX) {
            this.HETX = HETX;
        }

        public HTDTXBean getHTDTX() {
            return HTDTX;
        }

        public void setHTDTX(HTDTXBean HTDTX) {
            this.HTDTX = HTDTX;
        }

        public HTRDTXBean getHTRDTX() {
            return HTRDTX;
        }

        public void setHTRDTX(HTRDTXBean HTRDTX) {
            this.HTRDTX = HTRDTX;
        }

        public HTTXBean getHTTX() {
            return HTTX;
        }

        public void setHTTX(HTTXBean HTTX) {
            this.HTTX = HTTX;
        }

        public RDTXBean getRDTX() {
            return RDTX;
        }

        public void setRDTX(RDTXBean RDTX) {
            this.RDTX = RDTX;
        }

        public static class HCTXBean {
            private String HTLCscript;
            private String RSMCscript;
            private String addressHTLC;
            private String addressRSMC;
            private String txData;
            private String txId;
            private String witness;

            public String getHTLCscript() {
                return HTLCscript;
            }

            public void setHTLCscript(String HTLCscript) {
                this.HTLCscript = HTLCscript;
            }

            public String getRSMCscript() {
                return RSMCscript;
            }

            public void setRSMCscript(String RSMCscript) {
                this.RSMCscript = RSMCscript;
            }

            public String getAddressHTLC() {
                return addressHTLC;
            }

            public void setAddressHTLC(String addressHTLC) {
                this.addressHTLC = addressHTLC;
            }

            public String getAddressRSMC() {
                return addressRSMC;
            }

            public void setAddressRSMC(String addressRSMC) {
                this.addressRSMC = addressRSMC;
            }

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getTxId() {
                return txId;
            }

            public void setTxId(String txId) {
                this.txId = txId;
            }

            public String getWitness() {
                return witness;
            }

            public void setWitness(String witness) {
                this.witness = witness;
            }
        }

        public static class HEDTXBean {
            private String txData;
            private String txId;
            private String witness;

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getTxId() {
                return txId;
            }

            public void setTxId(String txId) {
                this.txId = txId;
            }

            public String getWitness() {
                return witness;
            }

            public void setWitness(String witness) {
                this.witness = witness;
            }
        }

        public static class HERDTXBean {
            private String txData;
            private String txId;
            private String witness;

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getTxId() {
                return txId;
            }

            public void setTxId(String txId) {
                this.txId = txId;
            }

            public String getWitness() {
                return witness;
            }

            public void setWitness(String witness) {
                this.witness = witness;
            }
        }

        public static class HETXBean {
            private String RSMCscript;
            private String addressRSMC;
            private String txData;
            private String txId;
            private String witness;

            public String getRSMCscript() {
                return RSMCscript;
            }

            public void setRSMCscript(String RSMCscript) {
                this.RSMCscript = RSMCscript;
            }

            public String getAddressRSMC() {
                return addressRSMC;
            }

            public void setAddressRSMC(String addressRSMC) {
                this.addressRSMC = addressRSMC;
            }

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getTxId() {
                return txId;
            }

            public void setTxId(String txId) {
                this.txId = txId;
            }

            public String getWitness() {
                return witness;
            }

            public void setWitness(String witness) {
                this.witness = witness;
            }
        }

        public static class HTDTXBean {
            private String txData;
            private String txId;
            private String witness;

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getTxId() {
                return txId;
            }

            public void setTxId(String txId) {
                this.txId = txId;
            }

            public String getWitness() {
                return witness;
            }

            public void setWitness(String witness) {
                this.witness = witness;
            }
        }

        public static class HTRDTXBean {
            private String txData;
            private String txId;
            private String witness;

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getTxId() {
                return txId;
            }

            public void setTxId(String txId) {
                this.txId = txId;
            }

            public String getWitness() {
                return witness;
            }

            public void setWitness(String witness) {
                this.witness = witness;
            }
        }

        public static class HTTXBean {
            private String RSMCscript;
            private String addressRSMC;
            private String txData;
            private String txId;
            private String witness;

            public String getRSMCscript() {
                return RSMCscript;
            }

            public void setRSMCscript(String RSMCscript) {
                this.RSMCscript = RSMCscript;
            }

            public String getAddressRSMC() {
                return addressRSMC;
            }

            public void setAddressRSMC(String addressRSMC) {
                this.addressRSMC = addressRSMC;
            }

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getTxId() {
                return txId;
            }

            public void setTxId(String txId) {
                this.txId = txId;
            }

            public String getWitness() {
                return witness;
            }

            public void setWitness(String witness) {
                this.witness = witness;
            }
        }

        public static class RDTXBean {
            private String txData;
            private String txId;
            private String witness;

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getTxId() {
                return txId;
            }

            public void setTxId(String txId) {
                this.txId = txId;
            }

            public String getWitness() {
                return witness;
            }

            public void setWitness(String witness) {
                this.witness = witness;
            }
        }
    }
}
