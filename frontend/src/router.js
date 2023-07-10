
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserProfileManagementUserProfileManager from "./components/listers/UserProfileManagementUserProfileCards"
import UserProfileManagementUserProfileDetail from "./components/listers/UserProfileManagementUserProfileDetail"

import DatingCoordinatorDateScheduleManager from "./components/listers/DatingCoordinatorDateScheduleCards"
import DatingCoordinatorDateScheduleDetail from "./components/listers/DatingCoordinatorDateScheduleDetail"

import MatchingAlgorithmMatchingResultManager from "./components/listers/MatchingAlgorithmMatchingResultCards"
import MatchingAlgorithmMatchingResultDetail from "./components/listers/MatchingAlgorithmMatchingResultDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/userProfileManagements/userProfiles',
                name: 'UserProfileManagementUserProfileManager',
                component: UserProfileManagementUserProfileManager
            },
            {
                path: '/userProfileManagements/userProfiles/:id',
                name: 'UserProfileManagementUserProfileDetail',
                component: UserProfileManagementUserProfileDetail
            },

            {
                path: '/datingCoordinators/dateSchedules',
                name: 'DatingCoordinatorDateScheduleManager',
                component: DatingCoordinatorDateScheduleManager
            },
            {
                path: '/datingCoordinators/dateSchedules/:id',
                name: 'DatingCoordinatorDateScheduleDetail',
                component: DatingCoordinatorDateScheduleDetail
            },

            {
                path: '/matchingAlgorithms/matchingResults',
                name: 'MatchingAlgorithmMatchingResultManager',
                component: MatchingAlgorithmMatchingResultManager
            },
            {
                path: '/matchingAlgorithms/matchingResults/:id',
                name: 'MatchingAlgorithmMatchingResultDetail',
                component: MatchingAlgorithmMatchingResultDetail
            },



    ]
})
