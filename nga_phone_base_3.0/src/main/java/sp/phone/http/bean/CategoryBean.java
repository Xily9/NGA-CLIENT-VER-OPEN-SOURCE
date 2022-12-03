package sp.phone.http.bean;

import java.util.List;

import gov.anzong.androidnga.common.base.JavaBean;

public class CategoryBean implements JavaBean {

    private String id;
    private String name;
    private List<GroupBean> groups;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GroupBean> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupBean> groups) {
        this.groups = groups;
    }

    public static class GroupBean {

        private String name;
        private List<ForumBean> forums;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ForumBean> getForums() {
            return forums;
        }

        public void setForums(List<ForumBean> content) {
            this.forums = content;
        }

        public static class ForumBean {
            /**
             * fid : 7
             * name : 艾泽拉斯议事厅
             * info : 魔兽主讨论区
             * nameS : 议事厅
             * bit : 1
             * infoS : 高阶讨论
             */

            private int fid;
            private String name;
            private String info;
            private String nameS;
            private String infoS;
            private int stid;
            private String head;

            public int getFid() {
                return fid;
            }

            public void setFid(int fid) {
                this.fid = fid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getNameS() {
                return nameS;
            }

            public void setNameS(String nameS) {
                this.nameS = nameS;
            }

            public String getInfoS() {
                return infoS;
            }

            public void setInfoS(String infoS) {
                this.infoS = infoS;
            }

            public int getStid() {
                return stid;
            }

            public void setStid(int stid) {
                this.stid = stid;
            }

            public String getHead() {
                return head;
            }

            public void setHead(String head) {
                this.head = head;
            }

            @Override
            public String toString() {
                return "ContentBean{" +
                        "fid=" + fid +
                        ", name='" + name + '\'' +
                        ", info='" + info + '\'' +
                        ", nameS='" + nameS + '\'' +
                        ", infoS='" + infoS + '\'' +
                        ", stid=" + stid +
                        ", head='" + head + '\'' +
                        '}';
            }
        }
    }
}
