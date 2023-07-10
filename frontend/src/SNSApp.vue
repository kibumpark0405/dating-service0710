

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                        데이트앱
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="userProfiles"
                        to="/userProfileManagements/userProfiles"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        사용자 프로필
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="dateSchedules"
                        to="/datingCoordinators/dateSchedules"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        데이트 일정
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="matchingResults"
                        to="/matchingAlgorithms/matchingResults"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        매칭 결과
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container v-else class="py-8 px-6 mt-10" fluid>
                <div style="width:86%; margin-left:7%; margin-top:-40px;">
                    <v-img style="width:100%; height:300px;"
                        src="https://oaidalleapiprodscus.blob.core.windows.net/private/org-IsZwoYj8yobpFySuytSuI26N/user-ha9EUDa76s1yoHT6JzgqOaFI/img-UmUbVqYPgrF4KPTum5MXP2nb.png?st&#x3D;2023-07-10T05%3A58%3A52Z&amp;se&#x3D;2023-07-10T07%3A58%3A52Z&amp;sp&#x3D;r&amp;sv&#x3D;2021-08-06&amp;sr&#x3D;b&amp;rscd&#x3D;inline&amp;rsct&#x3D;image/png&amp;skoid&#x3D;6aaadede-4fb3-4698-a8f6-684d7786b067&amp;sktid&#x3D;a48cca56-e6da-484e-a814-9c849652bcb3&amp;skt&#x3D;2023-07-09T21%3A02%3A25Z&amp;ske&#x3D;2023-07-10T21%3A02%3A25Z&amp;sks&#x3D;b&amp;skv&#x3D;2021-08-06&amp;sig&#x3D;xUdy4CRBzzGoBdWbPfe0e6f6mghReSPcCnP1sWuyvRg%3D"
                    ></v-img>
                    <div style="font-size: 24px; font-weight:700; margin:20px 0px 25px 0px;">우리의 서비스는 미정한 분야에서 최고 수준의 품질과 전문성을 제공합니다. 독특한 해결책과 창의적인 아이디어로 고객의 요구를 충족시키고, 탁월한 결과를 보장합니다. 당신의 성공을 만들어가는 파트너가 되어드리겠습니다.</div>
                </div>
                <v-row>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="userProfiles"
                                            to="/userProfileManagements/userProfiles"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            사용자 프로필
                                        </v-btn>
                                    </template>
                                    <span>사용자 프로필</span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;">데이트 프로필과 관련된 정보를 저장하는 집합체</div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="dateSchedules"
                                            to="/datingCoordinators/dateSchedules"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            데이트 일정
                                        </v-btn>
                                    </template>
                                    <span>데이트 일정</span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;">사용자들의 요구사항을 확인하고 데이트 장소와 시간을 조율하는 역할</div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="matchingResults"
                                            to="/matchingAlgorithms/matchingResults"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            매칭 결과
                                        </v-btn>
                                    </template>
                                    <span>매칭 결과</span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;">사용자들의 프로필을 분석하여 최적의 데이트 상대를 찾는 역할</div>
                        </v-card>

                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
        },
        goHome() {
            this.urlPath = null;
        },
    }
};
</script>
<style>
</style>
