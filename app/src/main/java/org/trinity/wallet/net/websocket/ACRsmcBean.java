package org.trinity.wallet.net.websocket;

public class ACRsmcBean extends BaseWebSocketBean {
    private String MessageType = "Rsmc";
    private String Sender;
    private String Receiver;
    private int TxNonce;
    private String ChannelName;
    private MessageBodyBean MessageBody;

    public String getMessageType() {
        return MessageType;
    }

    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String Sender) {
        this.Sender = Sender;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String Receiver) {
        this.Receiver = Receiver;
    }

    public int getTxNonce() {
        return TxNonce;
    }

    public void setTxNonce(int TxNonce) {
        this.TxNonce = TxNonce;
    }

    public String getChannelName() {
        return ChannelName;
    }

    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public MessageBodyBean getMessageBody() {
        return MessageBody;
    }

    public void setMessageBody(MessageBodyBean MessageBody) {
        this.MessageBody = MessageBody;
    }

    public static class MessageBodyBean {
        private BreachRemedyBean BreachRemedy;
        private CommitmentBean Commitment;
        private RevocableDeliveryBean RevocableDelivery;
        private String AssetType;
        private double Value;
        private int RoleIndex;
        private String Comments;

        public BreachRemedyBean getBreachRemedy() {
            return BreachRemedy;
        }

        public void setBreachRemedy(BreachRemedyBean BreachRemedy) {
            this.BreachRemedy = BreachRemedy;
        }

        public CommitmentBean getCommitment() {
            return Commitment;
        }

        public void setCommitment(CommitmentBean Commitment) {
            this.Commitment = Commitment;
        }

        public RevocableDeliveryBean getRevocableDelivery() {
            return RevocableDelivery;
        }

        public void setRevocableDelivery(RevocableDeliveryBean RevocableDelivery) {
            this.RevocableDelivery = RevocableDelivery;
        }

        public String getAssetType() {
            return AssetType;
        }

        public void setAssetType(String AssetType) {
            this.AssetType = AssetType;
        }

        public double getValue() {
            return Value;
        }

        public void setValue(double Value) {
            this.Value = Value;
        }

        public int getRoleIndex() {
            return RoleIndex;
        }

        public void setRoleIndex(int RoleIndex) {
            this.RoleIndex = RoleIndex;
        }

        public String getComments() {
            return Comments;
        }

        public void setComments(String Comments) {
            this.Comments = Comments;
        }

        public static class BreachRemedyBean {
            private String txDataSign;
            private OriginalDataBean originalData;

            public String getTxDataSign() {
                return txDataSign;
            }

            public void setTxDataSign(String txDataSign) {
                this.txDataSign = txDataSign;
            }

            public OriginalDataBean getOriginalData() {
                return originalData;
            }

            public void setOriginalData(OriginalDataBean originalData) {
                this.originalData = originalData;
            }

            public static class OriginalDataBean {
                private String txData;
                private String addressFunding;
                private String txId;
                private String scriptFunding;
                private String witness;

                public String getTxData() {
                    return txData;
                }

                public void setTxData(String txData) {
                    this.txData = txData;
                }

                public String getAddressFunding() {
                    return addressFunding;
                }

                public void setAddressFunding(String addressFunding) {
                    this.addressFunding = addressFunding;
                }

                public String getTxId() {
                    return txId;
                }

                public void setTxId(String txId) {
                    this.txId = txId;
                }

                public String getScriptFunding() {
                    return scriptFunding;
                }

                public void setScriptFunding(String scriptFunding) {
                    this.scriptFunding = scriptFunding;
                }

                public String getWitness() {
                    return witness;
                }

                public void setWitness(String witness) {
                    this.witness = witness;
                }
            }
        }

        public static class CommitmentBean {
            private String txData;
            private String addressRSMC;
            private String scriptRSMC;
            private String txId;
            private String witness;

            public String getTxData() {
                return txData;
            }

            public void setTxData(String txData) {
                this.txData = txData;
            }

            public String getAddressRSMC() {
                return addressRSMC;
            }

            public void setAddressRSMC(String addressRSMC) {
                this.addressRSMC = addressRSMC;
            }

            public String getScriptRSMC() {
                return scriptRSMC;
            }

            public void setScriptRSMC(String scriptRSMC) {
                this.scriptRSMC = scriptRSMC;
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

        public static class RevocableDeliveryBean {
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
