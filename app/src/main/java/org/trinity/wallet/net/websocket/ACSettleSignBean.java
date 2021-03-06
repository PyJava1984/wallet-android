package org.trinity.wallet.net.websocket;

public class ACSettleSignBean extends BaseWebSocketBean {
    private String MessageType;
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
        private SettlementBean Settlement;

        public SettlementBean getSettlement() {
            return Settlement;
        }

        public void setSettlement(SettlementBean Settlement) {
            this.Settlement = Settlement;
        }

        public static class SettlementBean {
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
}
